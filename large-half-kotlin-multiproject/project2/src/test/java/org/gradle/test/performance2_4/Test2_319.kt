package org.gradle.test.performance2_4

import org.junit.Assert.*

class Test2_319 {
    private val production = Production2_319("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}