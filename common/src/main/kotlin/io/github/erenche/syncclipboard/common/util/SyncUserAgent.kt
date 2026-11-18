package io.github.erenche.syncclipboard.common.util

/**
 * 同步请求统一使用的 User-Agent。
 *
 * 伪装为 Zotero 8 客户端，以通过中国科技云（CSTCloud）WebDAV
 * 对应用类型与版本的校验（其他 UA 会返回 Client type mismatch）。
 */
const val SYNC_USER_AGENT =
    "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.15; rv:128.0) Gecko/20100101 Firefox/128.0 Zotero/8.0.0"
