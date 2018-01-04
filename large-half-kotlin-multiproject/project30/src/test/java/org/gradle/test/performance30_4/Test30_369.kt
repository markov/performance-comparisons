package org.gradle.test.performance30_4

import org.junit.Assert.*

class Test30_369 {
    private val production = Production30_369("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}