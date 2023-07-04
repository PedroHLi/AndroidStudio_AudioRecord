package com.example.audio_record.record

import java.io.File

interface AudioRecorder {
    fun start(outputFile: File)
    fun stop()
}