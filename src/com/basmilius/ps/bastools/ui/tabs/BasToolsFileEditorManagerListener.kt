package com.basmilius.ps.bastools.ui.tabs

import com.intellij.openapi.fileEditor.FileEditorManager
import com.intellij.openapi.fileEditor.FileEditorManagerEvent
import com.intellij.openapi.fileEditor.FileEditorManagerListener
import com.intellij.openapi.fileEditor.ex.FileEditorManagerEx
import com.intellij.openapi.fileEditor.impl.EditorWindow
import com.intellij.openapi.fileEditor.impl.EditorWithProviderComposite
import com.intellij.openapi.vfs.VirtualFile

class BasToolsFileEditorManagerListener : FileEditorManagerListener
{

	/**
	 * {@inheritdoc}
	 */
	override fun fileOpened(source: FileEditorManager, file: VirtualFile)
	{
	}

	/**
	 * {@inheritdoc}
	 */
	override fun fileClosed(source: FileEditorManager, file: VirtualFile)
	{
	}

	/**
	 * {@inheritdoc}
	 */
	override fun selectionChanged(event: FileEditorManagerEvent)
	{
		val project = event.manager.project
		val manager = FileEditorManagerEx.getInstanceEx(project)

		val oldFile = event.oldFile
		val newFile = event.newFile

		for (window in manager.windows)
		{
			this.processTab(oldFile, window)
			this.processTab(newFile, window)
		}
	}

	/**
	 * Gets the editor index.
	 */
	private fun getEditorIndex(window: EditorWindow, composite: EditorWithProviderComposite): Int
	{
		return window.editors
				.takeWhile { it != composite }
				.count()
	}

	/**
	 * Processes the active tab fill.
	 */
	private fun processTab(file: VirtualFile?, window: EditorWindow)
	{
		val composite = window.findFileComposite(file) ?: return
		val editorIndex = this.getEditorIndex(window, composite)

		if (editorIndex < 0)
			return

		val tabs = window.tabbedPane ?: return

		if (tabs.tabCount <= editorIndex)
			return

		tabs.tabs.presentation.setActiveTabFillIn(BasToolsTabsPainterPatcherComponent.BackgroundColor)
	}

}
