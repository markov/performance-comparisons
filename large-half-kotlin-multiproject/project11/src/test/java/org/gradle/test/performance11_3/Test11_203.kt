package org.gradle.test.performance11_3

import org.junit.Assert.*

class Test11_203 {
    private val production = Production11_203("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}