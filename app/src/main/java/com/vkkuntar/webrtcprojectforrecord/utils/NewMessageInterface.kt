package com.vkkuntar.webrtcprojectforrecord.utils

import com.vkkuntar.webrtcprojectforrecord.models.MessageModel

interface NewMessageInterface {
    fun onNewMessage(message: MessageModel)
}