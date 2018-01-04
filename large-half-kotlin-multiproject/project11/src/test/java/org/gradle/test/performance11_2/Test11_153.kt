package org.gradle.test.performance11_2

import org.junit.Assert.*

class Test11_153 {
    private val production = Production11_153("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}