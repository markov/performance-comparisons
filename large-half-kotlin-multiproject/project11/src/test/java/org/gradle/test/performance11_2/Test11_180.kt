package org.gradle.test.performance11_2

import org.junit.Assert.*

class Test11_180 {
    private val production = Production11_180("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}