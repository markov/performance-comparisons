package org.gradle.test.performance11_5

import org.junit.Assert.*

class Test11_441 {
    private val production = Production11_441("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}