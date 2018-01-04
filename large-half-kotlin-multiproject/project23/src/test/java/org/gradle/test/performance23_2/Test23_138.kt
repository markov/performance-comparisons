package org.gradle.test.performance23_2

import org.junit.Assert.*

class Test23_138 {
    private val production = Production23_138("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}