package org.gradle.test.performance24_2

import org.junit.Assert.*

class Test24_192 {
    private val production = Production24_192("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}