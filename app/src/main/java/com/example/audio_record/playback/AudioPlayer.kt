package com.example.audio_record.playback

import java.io.File

interface AudioPlayer {
    fun playFile(file:File)
    fun stop()
}