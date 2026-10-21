// TemplateIDE — plantilla base profesional (oct-2026).
//
// AGP 9 trae Kotlin INTEGRADO de fabrica (2.2.10 en AGP 9.4.1):
// NO se aplica kotlin-android (aplicarlo aparte entra en conflicto
// con el nuevo DSL) y NO se declara version de Kotlin. Es el par
// exacto que Google compila, prueba y distribuye con AGP 9.4.
// Si manana se quiere un Kotlin mas nuevo, se declara via
// buildscript classpath (documento oficial de AGP 9), nunca
// con el plugin kotlin-android viejo.
plugins {
    id("com.android.application") version "9.4.1" apply false
    // Compilador de Compose: version atada a la de Kotlin en uso.
    id("org.jetbrains.kotlin.plugin.compose") version "2.2.10" apply false
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}
