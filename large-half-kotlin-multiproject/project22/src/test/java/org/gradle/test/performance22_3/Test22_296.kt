package org.gradle.test.performance22_3

import org.junit.Assert.*

class Test22_296 {
    private val production = Production22_296("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}