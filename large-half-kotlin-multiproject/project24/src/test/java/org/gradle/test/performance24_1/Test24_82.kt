package org.gradle.test.performance24_1

import org.junit.Assert.*

class Test24_82 {
    private val production = Production24_82("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}