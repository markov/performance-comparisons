package org.gradle.test.performance24_1

import org.junit.Assert.*

class Test24_79 {
    private val production = Production24_79("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}