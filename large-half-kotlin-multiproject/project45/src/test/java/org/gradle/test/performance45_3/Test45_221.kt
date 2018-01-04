package org.gradle.test.performance45_3

import org.junit.Assert.*

class Test45_221 {
    private val production = Production45_221("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
