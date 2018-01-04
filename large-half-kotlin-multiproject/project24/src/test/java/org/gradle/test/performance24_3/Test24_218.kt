package org.gradle.test.performance24_3

import org.junit.Assert.*

class Test24_218 {
    private val production = Production24_218("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}