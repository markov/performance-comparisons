package org.gradle.test.performance24_4

import org.junit.Assert.*

class Test24_363 {
    private val production = Production24_363("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}