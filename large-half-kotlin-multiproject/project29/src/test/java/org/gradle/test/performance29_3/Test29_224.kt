package org.gradle.test.performance29_3

import org.junit.Assert.*

class Test29_224 {
    private val production = Production29_224("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}