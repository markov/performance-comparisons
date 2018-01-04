package org.gradle.test.performance11_2

import org.junit.Assert.*

class Test11_144 {
    private val production = Production11_144("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}