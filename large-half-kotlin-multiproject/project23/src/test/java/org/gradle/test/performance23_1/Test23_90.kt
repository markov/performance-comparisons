package org.gradle.test.performance23_1

import org.junit.Assert.*

class Test23_90 {
    private val production = Production23_90("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}