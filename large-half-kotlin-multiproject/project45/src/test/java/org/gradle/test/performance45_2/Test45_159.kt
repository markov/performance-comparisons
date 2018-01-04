package org.gradle.test.performance45_2

import org.junit.Assert.*

class Test45_159 {
    private val production = Production45_159("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
