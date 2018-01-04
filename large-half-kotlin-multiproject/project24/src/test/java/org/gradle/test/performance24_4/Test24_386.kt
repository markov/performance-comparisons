package org.gradle.test.performance24_4

import org.junit.Assert.*

class Test24_386 {
    private val production = Production24_386("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}