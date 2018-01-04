package org.gradle.test.performance45_3

import org.junit.Assert.*

class Test45_253 {
    private val production = Production45_253("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
