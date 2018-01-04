package org.gradle.test.performance24_5

import org.junit.Assert.*

class Test24_445 {
    private val production = Production24_445("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}