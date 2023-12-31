package com.photoeditor.filters.collagemaker.feature_cropimages.preferences.frames.edit

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.photoeditor.filters.collagemaker.cropimages.imagecropper.models.ImageMaskOutline
import com.photoeditor.filters.collagemaker.feature_cropimages.preferences.CropTextField


@Composable
internal fun ImageMaskEdit(
    imageMaskOutline: ImageMaskOutline,
    onChange: (ImageMaskOutline) -> Unit
) {

    var newTitle by remember {
        mutableStateOf(imageMaskOutline.title)
    }

    Column {

        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Image(bitmap = imageMaskOutline.image, contentDescription = "ImageMask")

        }
        CropTextField(
            value = newTitle,
            onValueChange = {
                newTitle = it
                onChange(
                    imageMaskOutline.copy(
                        title = newTitle
                    )
                )

            }
        )
    }
}
