package org.gradle.test.performance45_2

import org.junit.Assert.*

class Test45_116 {
    private val production = Production45_116("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
