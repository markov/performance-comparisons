package org.gradle.test.performance29_1

import org.junit.Assert.*

class Test29_82 {
    private val production = Production29_82("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}