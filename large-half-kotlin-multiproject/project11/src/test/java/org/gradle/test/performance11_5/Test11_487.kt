package org.gradle.test.performance11_5

import org.junit.Assert.*

class Test11_487 {
    private val production = Production11_487("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}