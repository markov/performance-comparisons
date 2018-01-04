package org.gradle.test.performance11_1

import org.junit.Assert.*

class Test11_39 {
    private val production = Production11_39("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}