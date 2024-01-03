package com.mun.bonecci.composables.components.composables_icons

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

@Composable
fun rememberAndroid(): ImageVector {
    return remember {
        ImageVector.Builder(
            name = "android",
            defaultWidth = 40.0.dp,
            defaultHeight = 40.0.dp,
            viewportWidth = 40.0f,
            viewportHeight = 40.0f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(1.958f, 29.833f)
                quadToRelative(0.334f, -4.333f, 2.667f, -8.041f)
                quadToRelative(2.333f, -3.709f, 6.208f, -5.875f)
                lineTo(7.75f, 10.625f)
                quadToRelative(-0.125f, -0.333f, -0.021f, -0.729f)
                quadToRelative(0.104f, -0.396f, 0.438f, -0.604f)
                quadToRelative(0.375f, -0.209f, 0.791f, -0.084f)
                quadToRelative(0.417f, 0.125f, 0.625f, 0.5f)
                lineToRelative(3.042f, 5.209f)
                quadToRelative(3.5f, -1.5f, 7.375f, -1.5f)
                reflectiveQuadToRelative(7.375f, 1.5f)
                lineToRelative(3.042f, -5.209f)
                quadToRelative(0.208f, -0.375f, 0.645f, -0.5f)
                quadToRelative(0.438f, -0.125f, 0.813f, 0.084f)
                quadToRelative(0.333f, 0.208f, 0.458f, 0.625f)
                quadToRelative(0.125f, 0.416f, -0.041f, 0.708f)
                lineToRelative(-3.084f, 5.292f)
                quadToRelative(3.834f, 2.166f, 6.167f, 5.875f)
                quadToRelative(2.333f, 3.708f, 2.667f, 8.041f)
                close()
                moveToRelative(9.875f, -4.5f)
                quadToRelative(0.834f, 0f, 1.438f, -0.604f)
                reflectiveQuadToRelative(0.604f, -1.437f)
                quadToRelative(0f, -0.834f, -0.604f, -1.438f)
                reflectiveQuadToRelative(-1.438f, -0.604f)
                quadToRelative(-0.833f, 0f, -1.458f, 0.604f)
                reflectiveQuadToRelative(-0.625f, 1.438f)
                quadToRelative(0f, 0.833f, 0.625f, 1.437f)
                quadToRelative(0.625f, 0.604f, 1.458f, 0.604f)
                close()
                moveToRelative(16.375f, 0f)
                quadToRelative(0.834f, 0f, 1.459f, -0.604f)
                quadToRelative(0.625f, -0.604f, 0.625f, -1.437f)
                quadToRelative(0f, -0.834f, -0.625f, -1.438f)
                reflectiveQuadToRelative(-1.459f, -0.604f)
                quadToRelative(-0.833f, 0f, -1.437f, 0.604f)
                quadToRelative(-0.604f, 0.604f, -0.604f, 1.438f)
                quadToRelative(0f, 0.833f, 0.604f, 1.437f)
                quadToRelative(0.604f, 0.604f, 1.437f, 0.604f)
                close()
            }
        }.build()
    }
}