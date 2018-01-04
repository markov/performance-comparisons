package org.gradle.test.performance29_2

import org.junit.Assert.*

class Test29_144 {
    private val production = Production29_144("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}