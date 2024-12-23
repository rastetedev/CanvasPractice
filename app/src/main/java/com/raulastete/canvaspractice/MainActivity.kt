package com.raulastete.canvaspractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.raulastete.canvaspractice.ui.theme.CanvasPracticeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CanvasPracticeTheme {
                Scaffold { paddingValues ->
                    Column(
                        Modifier
                            .fillMaxSize()
                            .padding(paddingValues),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        InstagramLogo(
                            Modifier
                                .weight(1f)
                                .fillMaxWidth()
                                .padding(16.dp)
                        )
                        FacebookLogo(
                            Modifier
                                .weight(1f)
                                .fillMaxWidth()
                                .padding(16.dp)
                        )
                        MessengerLogo(
                            Modifier
                                .weight(1f)
                                .fillMaxWidth()
                                .padding(16.dp)
                        )
                        GooglePhotosLogo(
                            Modifier
                                .weight(1f)
                                .fillMaxWidth()
                                .padding(16.dp)
                        )
                        IosWeatherApp(
                            Modifier
                                .weight(1f)
                                .fillMaxWidth()
                                .padding(16.dp)
                        )
                    }

                }
            }
        }
    }
}