package org.gradle.test.performance11_2

import org.junit.Assert.*

class Test11_198 {
    private val production = Production11_198("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}