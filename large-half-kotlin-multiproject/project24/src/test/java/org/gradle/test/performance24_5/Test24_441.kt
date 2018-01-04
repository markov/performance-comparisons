package org.gradle.test.performance24_5

import org.junit.Assert.*

class Test24_441 {
    private val production = Production24_441("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}