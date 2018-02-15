package com.basmilius.bastools.component

import com.basmilius.bastools.component.basSettings.BasSettingsCodeStyleScheme
import com.intellij.openapi.application.ApplicationManager
import com.intellij.openapi.components.ProjectComponent
import com.intellij.openapi.project.Project
import com.intellij.psi.codeStyle.CodeStyleSchemes
import com.intellij.psi.codeStyle.CodeStyleSettingsManager
import java.io.IOException

/**
 * Class DefaultProjectComponent
 *
 * @constructor
 * @param project Project
 *
 * @author Bas Milius <bas@mili.us>
 * @package com.basmilius.bastools.component
 * @since 1.0.0
 */
class DefaultProjectComponent(private val project: Project): ProjectComponent
{

	/**
	 * {@inheritdoc}
	 *
	 * @author Bas Milius <bas@mili.us>
	 * @since 1.0.0
	 */
	override fun initComponent()
	{
	}

	/**
	 * {@inheritdoc}
	 *
	 * @author Bas Milius <bas@mili.us>
	 * @since 1.0.0
	 */
	override fun disposeComponent()
	{
	}

	/**
	 * {@inheritdoc}
	 *
	 * @author Bas Milius <bas@mili.us>
	 * @since 1.0.0
	 */
	override fun getComponentName() = "Bas Tools - Default Project"

	/**
	 * {@inheritdoc}
	 *
	 * @author Bas Milius <bas@mili.us>
	 * @since 1.0.0
	 */
	override fun projectOpened()
	{
		this.applyCodeStyleSettings()
		this.applyWorkspacePerUser()
	}

	/**
	 * {@inheritdoc}
	 *
	 * @author Bas Milius <bas@mili.us>
	 * @since 1.0.0
	 */
	override fun projectClosed()
	{
		val workspacePerUser = this.project.workspaceFile

		if (workspacePerUser === null)
			return

		val workspace = workspacePerUser.parent.findChild("workspace.xml")

		try
		{
			ApplicationManager.getApplication().runWriteAction {
				if (workspace != null && workspace.exists())
					workspace.delete(this)

				workspacePerUser.copy(this, workspacePerUser.parent, "workspace.xml")
			}
		}
		catch (e: IOException)
		{
			e.printStackTrace()
		}
	}

	/**
	 * Applies Bas Settings code style.
	 *
	 * @author Bas Milius <bas@mili.us>
	 * @since 1.0.0
	 */
	private fun applyCodeStyleSettings()
	{
		try
		{
			val oldSettings = CodeStyleSchemes.getInstance().findPreferredScheme("Bas Settings")
			if (oldSettings.name === "Bas Settings" && !oldSettings.isDefault)
				CodeStyleSchemes.getInstance().deleteScheme(oldSettings)
		}
		catch (e: Exception)
		{
			e.printStackTrace()
		}

		val bsScheme = BasSettingsCodeStyleScheme()
		CodeStyleSchemes.getInstance().addScheme(bsScheme)
		CodeStyleSchemes.getInstance().currentScheme = bsScheme

		CodeStyleSettingsManager.getInstance(this.project).setTemporarySettings(bsScheme.codeStyleSettings)
	}

	/**
	 * Applies workspace per user.
	 *
	 * @author Bas Milius <bas@mili.us>
	 * @since 1.0.0
	 */
	private fun applyWorkspacePerUser()
	{
		val workspace = this.project.workspaceFile ?: return

		val username = System.getProperty("user.name").toLowerCase()
		val workspacePerUserFilename = "workspace.$username.xml"
		val workspacePerUser = workspace.parent.findChild(workspacePerUserFilename)

		try
		{
			ApplicationManager.getApplication().runWriteAction {
				if (workspacePerUser != null && workspacePerUser.exists())
				{
					val contents = workspacePerUser.contentsToByteArray()
					val stream = workspace.getOutputStream(this)

					stream.write(contents)
					stream.close()

					workspacePerUser.delete(this)
				}

				workspace.rename(this, workspacePerUserFilename)
				workspace.copy(this, workspace.parent, "workspace.xml")
			}
		}
		catch (e: IOException)
		{
			e.printStackTrace()
		}
	}

}
