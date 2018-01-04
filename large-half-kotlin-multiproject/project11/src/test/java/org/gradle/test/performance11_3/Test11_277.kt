package org.gradle.test.performance11_3

import org.junit.Assert.*

class Test11_277 {
    private val production = Production11_277("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}