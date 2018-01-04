package org.gradle.test.performance2_2

import org.junit.Assert.*

class Test2_159 {
    private val production = Production2_159("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}