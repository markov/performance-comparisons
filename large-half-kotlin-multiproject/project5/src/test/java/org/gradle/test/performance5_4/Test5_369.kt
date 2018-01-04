package org.gradle.test.performance5_4

import org.junit.Assert.*

class Test5_369 {
    private val production = Production5_369("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}