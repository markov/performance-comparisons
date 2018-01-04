package org.gradle.test.performance17_2

import org.junit.Assert.*

class Test17_182 {
    private val production = Production17_182("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}