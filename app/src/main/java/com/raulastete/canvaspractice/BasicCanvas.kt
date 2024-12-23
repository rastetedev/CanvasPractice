package com.raulastete.canvaspractice

import android.graphics.Paint
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.nativeCanvas
import androidx.compose.ui.unit.dp

@Composable
fun InstagramLogo(modifier: Modifier = Modifier) {

    val brush = Brush.verticalGradient(
        listOf(Color.Red, Color.Blue)
    )

    Canvas(
        modifier = modifier
    ) {
        val centerCirclePosition = Offset(size.height.div(2), size.height.div(2))
        val cornerCirclePosition = Offset(size.height.times(0.8f), size.height.times(0.2f))

        drawRoundRect(
            brush = brush,
            cornerRadius = CornerRadius(x = 50f, y = 50f),
            style = Stroke(width = 10f),
            size = Size(size.height, size.height),
        )

        drawCircle(
            brush = brush,
            radius = 40f,
            style = Stroke(width = 10f),
            center = centerCirclePosition
        )

        drawCircle(
            brush = brush,
            radius = 24f,
            center = cornerCirclePosition
        )
    }
}

@Composable
fun FacebookLogo(modifier: Modifier = Modifier) {
    Canvas(modifier = modifier) {

        val paint = Paint().apply {
            textAlign = Paint.Align.CENTER
            textSize = 240f
            color = android.graphics.Color.WHITE
        }

        drawRoundRect(
            color = Color.Blue,
            cornerRadius = CornerRadius(x = 50f, y = 50f),
            size = Size(size.height, size.height)
        )

        drawContext.canvas.nativeCanvas.drawText(
            "f",
            size.height.div(2) + 40,
            center.y + 90,
            paint
        )
    }
}

@Composable
fun MessengerLogo(modifier: Modifier = Modifier) {
    Canvas(modifier = modifier.padding(8.dp)) {

        val logoSizeHeight = size.height
        val logoSizeWidth = logoSizeHeight.times(1.1f)

        val triangle = Path().apply {
            moveTo(
                logoSizeWidth.times(0.15f), logoSizeHeight.times(0.84f)
            )
            lineTo(logoSizeWidth.times(0.15f), logoSizeHeight.times(0.99f))
            lineTo(logoSizeWidth.times(0.3f), logoSizeHeight.times(0.91f))
        }

        val thunder = Path().apply {
            moveTo(logoSizeWidth.times(0.2f), logoSizeHeight.times(0.6f))
            lineTo(logoSizeWidth.times(0.45f), logoSizeHeight.times(0.34f))
            lineTo(logoSizeWidth.times(0.55f), logoSizeHeight.times(0.45f))
            lineTo(logoSizeWidth.times(0.8f), logoSizeHeight.times(0.33f))
            lineTo(logoSizeWidth.times(0.55f), logoSizeHeight.times(0.6f))
            lineTo(logoSizeWidth.times(0.45f), logoSizeHeight.times(0.47f))
            close()
        }

        drawOval(
            color = Color.Blue,
            size = Size(
                width = logoSizeWidth,
                height = logoSizeHeight
            )
        )

        drawPath(
            triangle,
            color = Color.Blue,
            style = Fill
        )

        drawPath(
            thunder,
            color = Color.White,
            style = Fill
        )
    }
}

@Composable
fun GooglePhotosLogo(modifier: Modifier = Modifier) {

    Canvas(modifier.padding(8.dp)) {

        val logoSizeHeight = size.height.div(2)

        drawArc(
            color = Color.Blue,
            startAngle = 0f,
            sweepAngle = 180f,
            useCenter = true,
            size = Size(logoSizeHeight, logoSizeHeight),
            topLeft = Offset(logoSizeHeight, logoSizeHeight.div(2))
        )

        drawArc(
            color = Color.Green,
            startAngle = 0f,
            sweepAngle = -180f,
            useCenter = true,
            size = Size(logoSizeHeight, logoSizeHeight),
            topLeft = Offset(0f, logoSizeHeight.div(2))
        )

        drawArc(
            color = Color.Red,
            startAngle = -90f,
            sweepAngle = 180f,
            useCenter = true,
            size = Size(logoSizeHeight, logoSizeHeight),
            topLeft = Offset(logoSizeHeight.div(2), 0f)
        )

        drawArc(
            color = Color.Yellow,
            startAngle = 90f,
            sweepAngle = 180f,
            useCenter = true,
            size = Size(logoSizeHeight, logoSizeHeight),
            topLeft = Offset(logoSizeHeight.div(2), logoSizeHeight)
        )
    }
}

@Composable
fun IosWeatherApp(modifier: Modifier = Modifier) {
    Canvas(modifier) {

        val logoSizeHeight = size.height

        val cloudPath = Path().apply {
            moveTo(logoSizeHeight.times(0.45f), logoSizeHeight.times(0.75f))

            cubicTo(
                logoSizeHeight.times(0.25f),
                logoSizeHeight.times(0.75f),
                logoSizeHeight.times(0.25f),
                logoSizeHeight.times(0.45f),
                logoSizeHeight.times(0.45f),
                logoSizeHeight.times(0.5f)
            )

            cubicTo(
                logoSizeHeight.times(0.45f),
                logoSizeHeight.times(0.2f),
                logoSizeHeight.times(0.65f),
                logoSizeHeight.times(0.15f),
                logoSizeHeight.times(0.75f),
                logoSizeHeight.times(0.4f)
            )

            cubicTo(
                logoSizeHeight.times(0.95f),
                logoSizeHeight.times(0.35f),
                logoSizeHeight.times(0.95f),
                logoSizeHeight.times(0.75f),
                logoSizeHeight.times(0.75f),
                logoSizeHeight.times(0.75f),
            )
        }

        drawRoundRect(
            color = Color.hsl(197f, 0.71f, 0.73f),
            cornerRadius = CornerRadius(120f, 120f),
            size = Size(width = logoSizeHeight, height = logoSizeHeight)
        )

        drawCircle(
            color = Color.Yellow,
            radius = logoSizeHeight.times(0.18f),
            center = Offset(
                x = logoSizeHeight.times(0.4f),
                y = logoSizeHeight.times(0.4f)
            )
        )

        drawPath(cloudPath, color = Color.White.copy(alpha = 0.95f))
    }
}