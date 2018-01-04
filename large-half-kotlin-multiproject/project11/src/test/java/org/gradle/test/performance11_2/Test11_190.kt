package org.gradle.test.performance11_2

import org.junit.Assert.*

class Test11_190 {
    private val production = Production11_190("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}