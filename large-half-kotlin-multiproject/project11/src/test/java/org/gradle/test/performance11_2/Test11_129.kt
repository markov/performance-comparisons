package org.gradle.test.performance11_2

import org.junit.Assert.*

class Test11_129 {
    private val production = Production11_129("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}