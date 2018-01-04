package org.gradle.test.performance12_3

import org.junit.Assert.*

class Test12_269 {
    private val production = Production12_269("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}