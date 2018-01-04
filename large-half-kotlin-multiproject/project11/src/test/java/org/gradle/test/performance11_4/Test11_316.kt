package org.gradle.test.performance11_4

import org.junit.Assert.*

class Test11_316 {
    private val production = Production11_316("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}