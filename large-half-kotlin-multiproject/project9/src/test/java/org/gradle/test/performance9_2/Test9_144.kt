package org.gradle.test.performance9_2

import org.junit.Assert.*

class Test9_144 {
    private val production = Production9_144("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}