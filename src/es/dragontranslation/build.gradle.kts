import io.github.keiyoushi.gradle.api.ContentWarning

plugins {
    alias(kei.plugins.extension)
}

keiyoushi {
    name = "Dragon Translation"
    versionCode = 1
    contentWarning = ContentWarning.MIXED
    libVersion = "1.6"

    source {
        name = "Dragon Translation"
        lang = "es"
        baseUrl = "https://dragontranslation.org"
    }

    deeplink {
        host("dragontranslation.org")
        path("/manga/..*")
    }
}
