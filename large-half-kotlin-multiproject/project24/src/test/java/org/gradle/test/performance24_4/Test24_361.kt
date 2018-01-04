package org.gradle.test.performance24_4

import org.junit.Assert.*

class Test24_361 {
    private val production = Production24_361("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}