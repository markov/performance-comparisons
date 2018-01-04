package org.gradle.test.performance7_2

import org.junit.Assert.*

class Test7_182 {
    private val production = Production7_182("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}