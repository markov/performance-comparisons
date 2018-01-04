package org.gradle.test.performance45_2

import org.junit.Assert.*

class Test45_105 {
    private val production = Production45_105("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
