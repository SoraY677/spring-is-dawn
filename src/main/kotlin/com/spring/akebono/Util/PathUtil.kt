package com.spring.akebono.Util

import org.springframework.web.servlet.resource.ContentVersionStrategy
import org.springframework.context.annotation.Bean

class PathUtil {
    companion object {

        val strategy = ContentVersionStrategy()

        @JvmStatic
        fun generateCashedPath(url: String): String? {
            val hash = this.strategy.extractVersion(url)
            val urlWithoutHash = url.replace("-" + hash, "")
            return urlWithoutHash + if (hash == null ) "" else "?" + hash 
        }
    }
}