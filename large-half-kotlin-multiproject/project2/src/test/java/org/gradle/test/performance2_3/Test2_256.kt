package org.gradle.test.performance2_3

import org.junit.Assert.*

class Test2_256 {
    private val production = Production2_256("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}