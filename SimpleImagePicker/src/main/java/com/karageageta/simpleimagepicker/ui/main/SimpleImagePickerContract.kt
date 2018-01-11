package com.karageageta.simpleimagepicker.ui.main

import com.karageageta.simpleimagepicker.model.data.Album
import com.karageageta.simpleimagepicker.model.data.Image
import com.karageageta.simpleimagepicker.ui.BaseContract
import java.io.File

interface SimpleImagePickerContract {
    interface View : BaseContract.View {
        fun scrollToTop()
        fun clearImages()
        fun addImages(items: List<Image>)
        fun finish()
    }

    interface Presenter<out T : BaseContract.View> : BaseContract.Presenter<T> {
        fun albumSelected(position: Int)
        fun saveSelected()
        fun loadAlbums(pickerAllItemTitle: String)
        fun albums(): List<Album>
        fun createValidFile(path: String): File?
    }
}